package com.simsek.vale;
import static org.assertj.core.api.Assertions.assertThat;
import com.simsek.vale.domain.Employee;
import com.simsek.vale.repo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;


@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class JPAUnitTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    EmployeeRepository repository;

    @Test
    public void should_store_an_employee() {

        Employee tutorial = repository.save(new Employee(null,"muhammed","05327960750") );
        assertThat(tutorial).hasFieldOrPropertyWithValue("name", "muhammed");
        assertThat(tutorial).hasFieldOrPropertyWithValue("phone", "05327960750");
    }

    @Test
    public void should_find_one_employee() {

        Employee tutorial = repository.save(new Employee(null,"muhammed","05327960750") );
        assertThat(repository.count()).isEqualTo(1);
    }
}
