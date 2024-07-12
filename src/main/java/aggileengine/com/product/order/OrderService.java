package aggileengine.com.product.order;

import aggileengine.com.product.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<CustomOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<CustomOrder> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public CustomOrder createOrder(CustomOrder order) {
        return orderRepository.save(order);
    }

    public CustomOrder updateOrder(Long id, CustomOrder orderDetails) {
        CustomOrder order = orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        order.setCustomerName(orderDetails.getCustomerName());
        order.setOrderItems(orderDetails.getOrderItems());
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        CustomOrder order = orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        orderRepository.delete(order);
    }
}

