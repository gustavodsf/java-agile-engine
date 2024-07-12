package aggileengine.com.product.order;

import aggileengine.com.product.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
@Validated
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<CustomOrder> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomOrder> getOrderById(@PathVariable Long id) {
        CustomOrder order = orderService.getOrderById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        return ResponseEntity.ok(order);
    }

    @PostMapping
    public CustomOrder createOrder(@Valid @RequestBody CustomOrder order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomOrder> updateOrder(@PathVariable Long id, @Valid @RequestBody CustomOrder orderDetails) {
        CustomOrder updatedOrder = orderService.updateOrder(id, orderDetails);
        return ResponseEntity.ok(updatedOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}
