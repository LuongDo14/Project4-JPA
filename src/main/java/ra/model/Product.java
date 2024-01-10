package ra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
    @Id
    @Column(name = "product_id",columnDefinition = "char(5)")
    private String id;
    @Column(name = "product_name",columnDefinition = "varchar(100)", nullable = false, unique = true)
    private String name;
    private float price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(columnDefinition = "varchar(200)")
    private String title;
    @Column(columnDefinition = "varchar(200)")
    private String description;
    @Column(name = "avatar_image",columnDefinition = "text")
    private String avatarImage;;
    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private List<Images> listImages = new ArrayList<>();
    @Column(columnDefinition = "varchar(20)")
    private String unit;
    @Column(name = "product_status")
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "catalog_id",referencedColumnName = "catalog_id")
    private Categories catalog;
}