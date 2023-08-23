import com.wusdragon.BootApp;
import com.wusdragon.mapper.ClassDomainMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Wusdragon
 * @date: 2023/8/16 15:19
 * @desc:
 */
@SpringBootTest(classes = BootApp.class)
public class BootAppTest {

    @Autowired
    private ClassDomainMapper classDomainMapper;

    @Test
    public void test001() {
        classDomainMapper.getById(3L);
    }
}
