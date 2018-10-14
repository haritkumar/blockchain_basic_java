# Blockchain Basic Java
A blockchain, originally block chain, is a growing list of records, called blocks, which are linked using cryptography. Each block contains a cryptographic hash of the previous block, a timestamp, and transaction data. By design, a blockchain is resistant to modification of the data.

## Run Test.java
```json
Trying to Mine block 1... 
Block Mined!!! : 000002695cd212abb189c53d6f1bddc1f5568d053d84ae5599236d7cfe26d589
Trying to Mine block 2... 
Block Mined!!! : 00000747339b341a75418053c29561d39a9e1fe6f2127e37c80a2119fa24d2d9
Trying to Mine block 3... 
Block Mined!!! : 00000fcb6382028245cf604677ecefc7d0703f3035a54b31b9d3f7563042c0ad

Blockchain is Valid: true

The block chain: 
[
  {
    "hash": "000002695cd212abb189c53d6f1bddc1f5568d053d84ae5599236d7cfe26d589",
    "previousHash": "0",
    "data": "Hi im the first block",
    "timeStamp": 1539539312661,
    "nonce": 4184274
  },
  {
    "hash": "00000747339b341a75418053c29561d39a9e1fe6f2127e37c80a2119fa24d2d9",
    "previousHash": "000002695cd212abb189c53d6f1bddc1f5568d053d84ae5599236d7cfe26d589",
    "data": "Yo im the second block",
    "timeStamp": 1539539324019,
    "nonce": 2974541
  },
  {
    "hash": "00000fcb6382028245cf604677ecefc7d0703f3035a54b31b9d3f7563042c0ad",
    "previousHash": "00000747339b341a75418053c29561d39a9e1fe6f2127e37c80a2119fa24d2d9",
    "data": "Hey im the third block",
    "timeStamp": 1539539333608,
    "nonce": 512360
  }
]

```

## How blockchain form
![alt text](https://res.cloudinary.com/haritkumar/image/upload/v1539536082/github/blocks.png)