
package asdasd.asdasd.asd.domain;

import lombok.Data;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import javax.persistence.*;
import javax.validation.constraints.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.io.Serializable;

/**
* @author ppolxda
* @date 2020-03-17 06:44:52.351274
*/
@Entity
@Data
@Table(name="order", schema="trade_temp")
public class DtoTradeTempOrder implements Serializable {





}
