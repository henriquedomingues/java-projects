# 📚 Sistema de Cadastro de Alunos (Java Console)

Este é um projeto simples em Java feito para praticar os conceitos de **POO (Programação Orientada a Objetos)**, utilizando **console**, **Listas (ArrayList)**, organização em pacotes (`model`, `service`) e interações com o usuário via `Scanner`.

## ✅ Funcionalidades

O sistema permite:

- ➕ Adicionar novos alunos
- 📋 Listar todos os alunos cadastrados
- 🔍 Buscar aluno pelo nome ou pelo RA
- ❌ Remover aluno pelo RA
- 🚪 Sair do sistema

---

## 🧱 Estrutura do Projeto

O projeto está dividido em pacotes:

src/
├── model/
│ └── Aluno.java # Classe que representa um aluno (nome, RA, idade)
│
├── service/
│ └── AlunoService.java # Classe de serviço que gerencia a lista de alunos
│
└── Main.java # Classe principal com menu interativo

---

## 📥 Como Executar

1. Clone este repositório ou copie os arquivos para sua IDE (IntelliJ, Eclipse, NetBeans, VS Code, etc).

2. Compile e execute o arquivo `Main.java`.

3. Use o menu exibido no console para interagir com o sistema.

---

## 💡 Exemplo de Uso

------BEM VINDO AO CADASTRO DE ALUNOS-----
Digite uma das opções abaixo:
1 - Adicionar aluno.
2 - Listar alunos.
3 - Buscar aluno.
4 - Remover aluno.
0 - Sair.

---

## 🛠 Tecnologias Utilizadas

- Java 8+
- Console (CLI)
- Programação Orientada a Objetos
- Listas Dinâmicas (`ArrayList`)
- Estrutura de pacotes

---

## 📌 Possíveis Melhorias Futuras

- Persistência em arquivos (salvar alunos em `.txt` ou `.json`)
- Interface gráfica com JavaFX ou Swing
- Testes automatizados com JUnit
- Validação de entrada do usuário

---

## 🧑‍💻 Autor

Henrique Ferreira Santos Domingues

---