package watsonassistant;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class WatsonAssistantController {

//    PRIVATE WATSONASSISTANTSERVICE WATSONASSISTANTSERVICE;
//
//    @AUTOWIRED
//    PUBLIC WATSONASSISTANTCONTROLLER(WATSONASSISTANTSERVICE WATSONASSISTANTSERVICE) {
//        THIS.WATSONASSISTANTSERVICE = WATSONASSISTANTSERVICE;
//    }

    @RequestMapping(value="/send", method = RequestMethod.GET)
//    public JsonNode send(@RequestParam("message") String message) throws JsonProcessingException {
    public String send(@RequestParam("message") String message) throws JsonProcessingException {

        //String response1 = watsonAssistantService.sendMessage("Hola");
//        WatsonAssistantMessage response;
//        response = watsonAssistantService.sendMessage(message);

//        return response.getGeneric();
    	System.out.println("Mensaje recibido: " + message);
    	return message;

    }

}


