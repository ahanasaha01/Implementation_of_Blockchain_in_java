# Implementation_of_Blockchain_in_java

I have at first created a block which contains 
* index
* timestamp to store creation date of block
* hash of the previous block
* data stored in the block
* also a nonce variable which is used to maintain integrity of the block

The hash of the blocks of our blockchain have been calculated from the cryptographic hashing algorithm SHA-256. Java has a MessageDigest class which helps us to retrieve an instance of the algorithm by entering the name of the getInstance() method.
We have also mined the blocks .
Blockchain is a class where we specify the size of the chain and in it there is a list of blocks.
Our Blockchain must allow the creation of new blocks and their mining taking into account the difficulty associated with it. So, we add a newBlock method to generate a new block associated with the last block known of the Blockchain.
To check the blockchain's validity I have verified the following:
* The first block is valid
* A new block is valid with the previous Blockchain block
* Blockchain is valid
Thus, the first block is valid if its index is equal to 0, it does not have a previous previousHash and finally if its hash is correct.
A new block is valid next to the previous block of the Blockchain if its index is incremented by 1 compared to the index of the previous block, its previousHash field is filled with the hash of the previous block and finally if its hash is itself coherent.
Finally, a Blockchain is valid and the integrity of its data is guaranteed when the first block is valid and each block that composes it is valid next to the block that precedes it.

![Screenshot 2023-06-29 160116](https://github.com/ahanasaha01/Implementation_of_Blockchain_in_java/assets/98249000/ff8f5e11-f69a-406e-8fdb-27639cb2778d)
