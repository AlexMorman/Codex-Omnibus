package ServerControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServerController
{
    private String goals;

    public ServerController()
    {
        goals = "Short Term Goals: Eat Food\nLong Term Goals: Get Ripped";
    }

    @GetMapping("/")
    public String index()
    {
        Application.LOGGER.info("GET Request received on index");
        return "Welcome to Codex Omnibus";
    }

    @GetMapping("/Goals")
    public String getGoals()
    {
        Application.LOGGER.info("GET Request received on Goals");
        return goals;
    }
}
