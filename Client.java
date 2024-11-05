public class Client {
    private Contract contract;
    private Document document;

    public void newDocument(Document document) {
        this.document = document;
        document.setExtension(".pdf");
        document.setEncryption("AES256");
        document.buildDoc();
    }

    public void requestCreateRentsalContract(Contract contract) {
        this.contract = contract;
        contract.buildContractID("12345");
        contract.buildPropertyID("P67890");
        contract.buildTenantID("T54321");
        contract.buildRentAmount(1500.00);
        contract.signContract();
    }
}