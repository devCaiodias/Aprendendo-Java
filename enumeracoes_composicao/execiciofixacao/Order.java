package enumeracoes_composicao.execiciofixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private OrderStatus status;

    public Cliente cliente;
    private List<OrderItems> ordemItems = new ArrayList<>();

    public Order(){}

    public Order(Date momento, OrderStatus status, Cliente cliente){
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment(){
        return momento;
    }

    public void setMoment(Date moment){
        this.momento = moment;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public List<OrderItems> getOrdemItems(){
        return ordemItems;
    }


    public void addOrdemItems(OrderItems items){
        ordemItems.add(items);
    }
    
    public void removeOrdemItems(OrderItems items){
        ordemItems.remove(items);
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItems item : ordemItems) {
            sum += item.subTotal();
        }
        return sum;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Order moment: " );
        sb.append(sdf.format(momento) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Order items: \n");
        for (OrderItems o : ordemItems) {
                sb.append(o + "\n ");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
