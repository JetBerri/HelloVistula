import module java.base;

public class Main {
     public static void main(String[] args) {

        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        int quantity = 10_000;

        BigDecimal singleVat = productCost.multiply(vatRate);
        IO.println("VAT per product: " + singleVat);

        BigDecimal totalNet = BigDecimal.ZERO;
        BigDecimal totalVat = BigDecimal.ZERO;
        BigDecimal totalGross = BigDecimal.ZERO;

        for (int i = 0; i < quantity; i++) {
            totalNet = totalNet.add(productCost);
            totalVat = totalVat.add(singleVat);
            totalGross = totalGross.add(productCost.add(singleVat));
        }

        IO.println("Total NET: " + totalNet.setScale(2, RoundingMode.HALF_UP));
        IO.println("Total VAT: " + totalVat.setScale(2, RoundingMode.HALF_UP));
        IO.println("Total Gross: " + totalGross.setScale(2, RoundingMode.HALF_UP));

    }
}
