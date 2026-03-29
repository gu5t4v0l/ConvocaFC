ConvocaFC
<p align="center">
<img src="https://img.shields.io/badge/Kotlin-2.0.21-purple?style=flat&logo=kotlin" alt="Kotlin Version">
<img src="https://img.shields.io/badge/Android-Min%20SDK%2024-green?style=flat&logo=android" alt="Android Min SDK">
<img src="https://img.shields.io/badge/Compose-Jetpack-blue?style=flat&logo=jetpackcompose" alt="Jetpack Compose">
<img src="https://img.shields.io/github/license/gu5t4v0l/ConvocaFC" alt="License">
</p>

📋 Descrição
ConvocaFC é o aplicativo definitivo para organizar e controlar a sua "pelada" (futebol amador). Chega de confusão no WhatsApp para confirmar presença, definir times ou gerenciar o financeiro do grupo. O app centraliza tudo o que você precisa para manter o seu grupo de futebol organizado e competitivo.

Este projeto está em desenvolvimento ativo e utiliza as tecnologias mais modernas do ecossistema Android.

✨ Funcionalidades (Em Desenvolvimento)
Gestão de Presença: Confirmação de quem vai ao jogo de forma simples.

Controle Financeiro: Gerencie mensalidades, pagamentos avulsos e despesas do grupo (aluguel de quadra, churrasco, etc.).

Ranking: Sistema de pontuação para os jogadores (gols, assistências, vitórias).

Sorteio de Times: Algoritmo para equilibrar as equipes com base no nível dos jogadores.

🛠️ Tecnologias e Arquitetura
O projeto foi construído seguindo as melhores práticas de desenvolvimento Android moderno:

Linguagem: Kotlin (v2.0.21).

UI: Jetpack Compose para uma interface declarativa e moderna.

Navegação: Jetpack Navigation Compose para transições entre telas.

Banco de Dados: Room Database para persistência de dados local (com suporte a KSP).

Injeção de Dependência: (Planejado/Em implementação).

Gerenciador de Dependências: Gradle Kotlin DSL com o novo sistema de Version Catalogs (libs.versions.toml).

🚀 Como Executar o Projeto
Pré-requisitos:

Android Studio (Versão Ladybug | 2024.2.1 ou superior recomendada).

JDK 17 ou superior.

Clonar o Repositório:

Bash
git clone https://github.com/gu5t4v0l/ConvocaFC.git
Abrir no Android Studio:

Abra o Android Studio.

Selecione Open an Existing Project.

Navegue até a pasta onde clonou o repositório e selecione-a.

Sincronizar e Rodar:

Aguarde a sincronização do Gradle terminar.

Conecte um dispositivo físico ou inicie um emulador.

Clique no botão Run (ícone de "Play" verde) na barra superior.

🏗️ Estrutura do Projeto
/app/src/main/java/com/gl/convocafc: Pacote raiz do código fonte.

MainActivity.kt: Ponto de entrada do aplicativo e configuração da navegação (NavHost).

/ui/theme: Configurações de cores, tipografia e tema do Compose.

Outras telas como Wellcome, MainMenu, etc., estão definidas no mesmo nível da MainActivity (recomenda-se organizar em pacotes futuramente).

🤔 Contribuindo
Se você quiser contribuir para o desenvolvimento do ConvocaFC:

Faça um Fork do projeto.

Crie uma Branch para sua feature (git checkout -b feature/NovaFeature).

Faça Commit das suas alterações (git commit -m 'Adicionando nova feature').

Faça Push para a Branch (git push origin feature/NovaFeature).

Abra um Pull Request.

📝 Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para detalhes.

Desenvolvido com ❤️ por Gustavo Oliveira.
