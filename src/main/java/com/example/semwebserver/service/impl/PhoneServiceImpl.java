package com.example.semwebserver.service.impl;

import com.example.semwebserver.service.PhoneService;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdfconnection.RDFConnection;
import org.apache.jena.rdfconnection.RDFConnectionFuseki;
import org.apache.jena.rdfconnection.RDFConnectionRemoteBuilder;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;

@Service
public class PhoneServiceImpl implements PhoneService {

    private final String DESTINATION = "http://localhost:3030/name";

    private final RDFConnectionRemoteBuilder builder = RDFConnectionFuseki.create().destination(DESTINATION);

    @Override
    public String getAll() {
        try (RDFConnection connection = (RDFConnectionFuseki) builder.build()) {
            QueryExecution qExecution = connection.query("PREFIX ex: <http://semweb.edu.vn/example#> " +
                    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> " +
                    "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#> " +
                    "SELECT ?s ?p ?o WHERE { ?s ?p ?o . }");
            ResultSet rs = qExecution.execSelect();
//            while (rs.hasNext()) {
//                QuerySolution qs = rs.next();
//                Resource p = qs.getResource("p");
//                RDFNode o = qs.get("o");
//                System.out.printf("%s    %s%n", p.getLocalName(), o.toString());
//            }
//            qExecution.close();

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ResultSetFormatter.outputAsJSON(outputStream, rs);
            qExecution.close();
            return outputStream.toString();
        }
    }
}
