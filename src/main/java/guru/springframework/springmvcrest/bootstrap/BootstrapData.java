package guru.springframework.springmvcrest.bootstrap;


import guru.springframework.springmvcrest.domain.Customer;
import guru.springframework.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data ...");

        Customer c1 = new Customer();
        c1.setFirstname("Nicole");
        c1.setLastname("Wallace");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstname("Rachael");
        c2.setLastname("Maddow");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Joy");
        c3.setLastname("Reid");
        customerRepository.save(c3);

        System.out.println("Customer Saved: " + customerRepository.count());


    }
}
