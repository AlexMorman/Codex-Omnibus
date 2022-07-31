package ServerControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServerController
{
    @GetMapping("/")
    public String index()
    {
        Application.LOGGER.info("GET Request received on index");
        return "Welcome to Codex Omnibus";
    }
}
