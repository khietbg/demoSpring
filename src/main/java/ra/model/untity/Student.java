package ra.model.untity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private int studentId;
    @Column(name="studentName",columnDefinition = "nvarchar(50)",nullable = false)
    private String studentName;
    @Column(name="age")
    private int age;
    @Column(name = "birthDate")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthDate;
    @Column(name = "studentStatus")
    private boolean studentStatus;
}
