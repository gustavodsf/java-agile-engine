package aggileengine.com.product.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<CustomOrder, Long> {
}
