# Jogo da Cobrinha em Java

Este é um simples jogo da cobrinha implementado em Java, onde o jogador controla uma cobra que deve comer comida e crescer, evitando colidir com as paredes ou com seu próprio corpo.

## Requisitos

Certifique-se de que você tenha o seguinte software instalado:

- Java Development Kit (JDK): É necessário ter o JDK instalado para compilar e executar o jogo. Você pode obtê-lo no site oficial da Oracle ou usando um gerenciador de pacotes, como o OpenJDK.
- Uma IDE Java: Recomenda-se o uso de uma IDE (Integrated Development Environment) como Eclipse, IntelliJ IDEA ou NetBeans para uma experiência de desenvolvimento mais produtiva. No entanto, você também pode usar um editor de texto simples e compilar via linha de comando.

## Como jogar

1. Clone este repositório em sua máquina local usando o seguinte comando:
https://github.com/7-Dodi/SnakeGame.git


2. Abra o projeto em sua IDE Java.

3. Localize o arquivo `Main.java` e execute-o para iniciar o jogo.

4. Use as teclas de seta (cima, baixo, esquerda, direita) para controlar a direção da cobra.

5. Tente comer a comida representada por um asterisco (*) para fazer a cobra crescer.

6. O jogo termina se a cobra colidir com a parede ou consigo mesma.

## Estrutura do projeto

- `src/`
  - `Main.java`: Contém o ponto de entrada do jogo.
  - `Snake.java`: Classe que representa a cobra e suas ações.
  - `GamePanel.java`: Classe que cuida da renderização do jogo na tela.
  - `Food.java`: Classe que representa a comida gerada aleatoriamente.
  - `Direction.java`: Enumeração para representar as direções possíveis da cobra.
- `snake_game_screenshot.png`: Captura de tela do jogo.

## Personalização

Você pode personalizar o jogo da cobrinha adicionando novos recursos ou melhorando a interface do usuário. Algumas ideias incluem:

- Implementar níveis de dificuldade com velocidades diferentes.
- Adicionar pontuação ao comer a comida.
- Criar um painel de pontuação e níveis.
- Incluir efeitos sonoros e música de fundo.

## Contribuição

Se você quiser contribuir com melhorias para o jogo da cobrinha, fique à vontade para criar um fork deste repositório e enviar suas solicitações de pull.

## Créditos

Este jogo da cobrinha foi desenvolvido com base no trabalho de vários desenvolvedores da comunidade Java, além de outros recursos online.

## Licença

Este projeto é licenciado sob a Licença MIT. Consulte o arquivo LICENSE para obter mais informações.

Divirta-se jogando! 🐍🎮
