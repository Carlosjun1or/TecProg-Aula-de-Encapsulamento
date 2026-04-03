# 🔐 Encapsulamento em Java

Atividade desenvolvida na **FATEC Praia Grande** para a aula de **Técnicas de Programação** com foco no conceito de **Encapsulamento** da Programação Orientada a Objetos (POO).

---

## 📋 Sobre o Projeto

Este projeto reúne **3 exercícios práticos** que evoluem classes do mundo real aplicando encapsulamento, controle de acesso e validações nos setters.

O objetivo principal é aplicar conceitos como:

- Encapsulamento (atributos `private`)
- Métodos `get` e `set` com validação
- Separação entre **Model** e **View**
- Interação com o usuário via terminal (Scanner)

---

## 🚀 Tecnologias Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)<br>
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)<br>
![POO](https://img.shields.io/badge/POO-Programação%20Orientada%20a%20Objetos-blue?style=for-the-badge)<br>

---

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── encapsulamento/           
                    ├── model/
                    │   ├── Carro.java
                    │   ├── ContaBancaria.java
                    │   └── Produto.java
                    │
                    └── view/
                        └── Main.java
```

---

## 🧱 Modelagem Orientada a Objetos

### 🔹 1. Carro

| Tipo | Descrição |
|------|-----------|
| **Atributos** | marca, modelo, ano, capacidadeTanque |
| **Métodos** | calcularCustoAbastecer(valorGasolina) |

- Usuário informa os dados do carro e o preço da gasolina
- O método retorna o custo total para encher o tanque



### 🔹 2. Conta Bancária

| Tipo | Descrição |
|------|-----------|
| **Atributos** | titular, saldo (privado) |
| **Métodos** | depositar(valor), sacar(valor), getSaldo() |

- Saldo só pode ser alterado via `depositar` ou `sacar`
- `depositar` só aceita valores positivos
- `sacar` só permite valores menores ou iguais ao saldo atual



### 🔹 3. Produto

| Tipo | Descrição |
|------|-----------|
| **Atributos** | nome, preco, quantidadeEstoque |
| **Métodos** | getters e setters com validação |

- `setPreco` rejeita valores negativos
- `setQuantidadeEstoque` rejeita valores negativos

---

## 👤 Autor

| Nome |
|------|
| Carlos Roberto |
