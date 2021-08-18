package one.digitalinnovation.experts.shoppingCart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@Entity
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
public class ListProducts {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ManyToOne
    private Long id;

    @Column
    private Long productID;

    @Column
    private BigDecimal price;

}
