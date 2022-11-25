public class CreditCard extends PaymentMethod{

  @Override
  public void pay() {
    System.out.println("Pagamento com cartão de crédito feito com sucesso.");
    
  }
}
