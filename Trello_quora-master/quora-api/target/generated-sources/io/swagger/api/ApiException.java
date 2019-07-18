package io.swagger.api;

<<<<<<< HEAD
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-18T22:17:00.572+05:30")
=======
<<<<<<< HEAD
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-13T20:15:59.344+05:30")
=======
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-17T08:46:10.636+05:30")
>>>>>>> origin/user
>>>>>>> master

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
