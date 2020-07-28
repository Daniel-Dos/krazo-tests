package org.eclipse.krazo.test.convert.annotations;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.binding.MvcBinding;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("converter-annotations")
public class AnnotationConverterController {

    @Inject
    private NumberTransporter numberTransporter;

    @Inject
    private Models models;

    @GET
    public String doGetIndex() {
        return "index.jsp";
    }

    @GET
    @Path("result")
    public String doGetResult() {
        models.put("resultNumber", numberTransporter.getNumber());

        return "result.jsp";
    }

    @POST
    public String doPost(@MvcBinding @AnswerToAll(theAnwser = 42.0D) @FormParam("number") final double someNumber) {
        numberTransporter.setNumber(someNumber);
        return "redirect:/converter-annotations/result";
    }
}
