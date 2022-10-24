package esprit.tn.soa.grapgql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import esprit.tn.soa.repository.StudentRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import esprit.tn.soa.grapgql.Query;
import esprit.tn.soa.grapgql.Mutation;


@WebServlet(urlPatterns= "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet{
	
	
	public GraphQLEndpoint() {
		super(buildSchema());
	}
	
	private static GraphQLSchema buildSchema() {
		StudentRepository studentReporitory = new StudentRepository();
		return SchemaParser.newParser()
				.file("shema.graphqls")
				.resolvers(new Query(studentReporitory),new Mutation(studentReporitory))
				.build()
				.makeExecutableSchema();
	}

}
