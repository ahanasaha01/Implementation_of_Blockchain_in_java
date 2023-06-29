public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);
        blockchain.addBlock(blockchain.newBlock("Ahana"));
        blockchain.addBlock(blockchain.newBlock("Soumoshree"));
        blockchain.addBlock(blockchain.newBlock("Ashutosh"));

        System.out.println("Blockchain valid ? " + blockchain.isBlockChainValid());
        System.out.println(blockchain);
    }
}