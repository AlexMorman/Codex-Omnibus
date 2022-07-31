package ServerControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ServerController
{
    private String goals;

    public ServerController()
    {
        goals = "Eat Food, Get Ripped";
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

    @PostMapping("/AddGoal")
    public void addGoals(@RequestBody String newGoal)
    {
        Application.LOGGER.info("POST Request on /AddGoals");
        goals += (", " + newGoal);
    }
}
