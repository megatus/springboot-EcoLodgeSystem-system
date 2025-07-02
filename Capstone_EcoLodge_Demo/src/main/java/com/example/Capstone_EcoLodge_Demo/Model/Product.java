import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class Product {
    private int prodID;
    private String Name;
    private int Price;
    public Product() {
        
    }
}