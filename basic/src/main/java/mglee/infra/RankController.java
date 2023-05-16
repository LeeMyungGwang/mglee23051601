package mglee.infra;
import mglee.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/ranks")
@Transactional
public class RankController {
    @Autowired
    RankRepository rankRepository;




    @PutMapping("/ranks/search/")
    public Object (@RequestBody RankViewQuery query){
        return rankRepository.(query.getName());
    }
}
