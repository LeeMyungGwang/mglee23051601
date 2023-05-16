package mglee.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mglee.BasicApplication;
import mglee.domain.RankAdd;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Rank_table")
@Data
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        RankAdd rankAdd = new RankAdd(this);
        rankAdd.publishAfterCommit();
    }

    public static RankRepository repository() {
        RankRepository rankRepository = applicationContext()
            .getBean(RankRepository.class);
        return rankRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
