package guessthenumbers.spring;

/**
 * Created by Moti on 26/05/2018.
 */import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/lottery")
public class LotteryNumberImpl implements LotteryNumberInterface {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String generateLotteryNumber() {

        List<Integer> digitsOfTheNumber = new ArrayList<Integer>();
        String luckyNumber = "";
        Random rnd = new Random();
        Integer tempInt = 0;

        //Generate a new digit four times
        for (int i = 0; i < 4; i++) {
            do {
                tempInt = rnd.nextInt(10);
            } while (digitsOfTheNumber.contains(tempInt));

            //While we have a valid number, we're adding him to the string for send the lottery number, and to the array for next step validation
            digitsOfTheNumber.add(tempInt);
            luckyNumber += tempInt.toString();
        }
        return luckyNumber;
    }
}