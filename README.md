# Patterns para sala de aula

Este repositório contém exemplos e implementações de padrões de design para serem usados no ensino de conceitos de engenharia de software. O objetivo deste repositório é proporcionar um material didático que demonstre como os padrões de design podem ser aplicados para resolver problemas comuns no desenvolvimento de software de maneira eficiente e escalável.

## Padrões de Design Abordados

O repositório cobre os principais padrões de design utilizados em software, classificados em três categorias principais:



### 1. Creational Patterns (Padrões Criacionais)

Estes padrões tratam da criação de objetos de forma eficiente e flexível. São úteis quando a criação de objetos precisa ser desacoplada do código que os utiliza.

- Singleton: Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
- Factory Method: Define uma interface para criar um objeto, mas permite que as subclasses decidam qual classe instanciar.
- Abstract Factory: Permite criar famílias de objetos relacionados sem especificar suas classes concretas.
- Builder: Usado para criar um objeto complexo, passo a passo, separando a construção da representação do objeto.
- Prototype: Cria novos objetos copiando um objeto protótipo existente.

### 2. Structural Patterns (Padrões Estruturais)

Esses padrões tratam da composição de classes e objetos, ajudando a criar estruturas mais eficientes e flexíveis.

- Adapter: Permite que duas interfaces incompatíveis se comuniquem.
- Bridge: Desacopla uma abstração de sua implementação para que as duas possam evoluir independentemente.
- Composite: Permite que objetos compostos (como um conjunto de objetos) sejam tratados da mesma forma que objetos individuais.
- Decorator: Adiciona funcionalidades a um objeto de forma flexível, sem modificar sua estrutura original.
- Facade: Oferece uma interface simplificada para um conjunto de interfaces em um subsistema.
- Flyweight: Usa compartilhamento para suportar grandes quantidades de objetos de forma eficiente em termos de memória.
- Proxy: Controla o acesso a um objeto, podendo ser usado para adicionar funcionalidades como segurança ou controle de acesso

### 3. Behavioral Patterns (Padrões Comportamentais)

Esses padrões tratam da comunicação entre objetos, ajudando a melhorar a interação e a comunicação dentro de um sistema.

- Observer: Define uma dependência de um-para-muitos entre objetos, para que quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.
- Strategy: Define uma família de algoritmos e os torna intercambiáveis, permitindo que o algoritmo varie independentemente dos clientes que o utilizam.
- Command: Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações e suportar operações de desfazer/refazer.
- Iterator: Fornece uma maneira de acessar os elementos de um objeto agregado (como uma lista ou coleção) sequencialmente, sem expor sua representação interna.
- State: Permite que um objeto altere seu comportamento quando seu estado interno mudar, parecendo que o objeto mudou de classe.
- Template Method: Define o esqueleto de um algoritmo, permitindo que subclasses preencham etapas específicas sem modificar a estrutura do algoritmo.
- Chain of Responsibility: Permite que múltiplos objetos processem uma solicitação sem que o remetente precise saber qual objeto irá processá-la.
- Mediator: Define um objeto que centraliza a comunicação entre outros objetos, evitando que eles se comuniquem diretamente entre si.
- Memento: Permite salvar o estado interno de um objeto sem violar seu encapsulamento, permitindo a restauração posterior desse estado.
- Visitor: Permite adicionar novas operações a uma estrutura de objetos sem alterar suas classes.
- Interpreter: Dá uma gramática para interpretar sentenças em uma linguagem específica, como em um analisador de expressões.