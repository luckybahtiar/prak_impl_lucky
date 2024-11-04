class StudentCinema extends Product {
private final double price;
public StudentCinema(double price) {
this.price = price;
}
@Override
String getName() {
return "Student Cinema Ticket";
}
@Override
public Double getPrice() {
return price;
}
public Double calculateAdminFee() {
return price * 2 / 100; // Biaya admin 2%
}
}
