package ServerControllers;

import DataStructures.Goal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.logging.Logger;

@RestController
public class ServerController
{
    private ArrayList<Goal> goals;

    public ServerController()
    {
        goals = new ArrayList<>();
        goals.add(new Goal("Get Ripped", "Bench Press 100 lbs"));
    }

    @GetMapping("/")
    public String index()
    {
        Application.LOGGER.info("GET Request received on index");
        return "Welcome to Codex Omnibus";
    }

    @GetMapping("/Goals")
    public ArrayList<Goal> getGoals()
    {
        Application.LOGGER.info("GET Request received on Goals");
        return goals;
    }

    @PostMapping("/AddGoal")
    public void addGoals(@RequestBody Goal goal)
    {
        Application.LOGGER.info("POST Request on /AddGoals");
        goals.add(goal);
    }
}
