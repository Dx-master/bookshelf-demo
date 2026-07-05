# bookshelf-demo

A deliberately small Java project that serves as the **target repository** of the
[ticket-coder-agent](https://github.com/Dx-master/ticket-coder-agent): the agent reads a ticket
from a Trello board and opens pull requests against this repository implementing it.

## What's inside

- `Book` / `Library` — a tiny in-memory bookshelf.
- Pull requests opened by the agent will appear here, one branch per Trello ticket.

## Build

```bash
mvn test
```
