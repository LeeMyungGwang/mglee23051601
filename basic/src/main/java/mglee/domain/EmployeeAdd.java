package mglee.domain;

import java.util.*;
import lombok.*;
import mglee.domain.*;
import mglee.infra.AbstractEvent;

@Data
@ToString
public class EmployeeAdd extends AbstractEvent {

    private Long id;
    private Long userId;
    private DepartmentId departmentId;
    private RankId rankId;
    private EmployeeUser employeeUser;

    public EmployeeAdd(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdd() {
        super();
    }
}
