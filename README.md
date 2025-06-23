# 🤖 FRC Robot Code - TalonFX Drive Subsystem (Phoenix 6)

Este repositório contém o código fonte para um robô FRC com movimentação baseada em **motores TalonFX** e usando a biblioteca **Phoenix 6** da CTRE. Ele implementa um subsistema de tração com controle manual via controle Xbox, além de exibir dados em tempo real no **SmartDashboard**.

---

## 📁 Estrutura do Projeto

- `Constants.java`: Contém valores fixos como IDs, limites de corrente e configurações de inversão.
- `DriveSubSystem.java`: Subsistema que inicializa e controla um motor **Kraken X60 / TalonFX**, incluindo leitura de sensores.
- `DriveCommand.java`: Comando que move o motor com velocidade constante até o botão A ser pressionado.
- `RobotContainer.java`: Responsável por instanciar comandos/subsistemas e mapear os botões do controle.
- `Robot.java`: Classe principal que gerencia os ciclos de vida do robô (autônomo, teleoperado, teste, etc).

---

## 🎮 Controles

- **Analógico Esquerdo (XBox)**: Controla a velocidade do motor continuamente.
- **Botão B**: Inicia `DriveCommand`, que movimenta o motor a 20% da potência.
- **Botão A**: Interrompe o `DriveCommand`.

---

## 📊 SmartDashboard

As seguintes informações são exibidas no painel:

- Posição do encoder (em rotações)
- Velocidade do encoder (em RPM)
- Corrente do motor (Amperes)
- Tensão do motor (Volts)
- Temperatura do motor (°C)
- Duty Cycle do motor (0.0 a 1.0)

---

## ⚙️ Configurações

Definidas em `Constants.java`:

| Configuração            | Valor   |
|------------------------|---------|
| ID do motor frontal    | 10      |
| Corrente máxima        | 70 A    |
| Pico de corrente       | 120 A   |
| Tempo de limiar        | 0.1 s   |
| Modo neutro            | Brake   |
| Rampagem fechada       | 0.25 s  |
| Inversão do motor      | false   |

---

## 🧪 Dependências

- [WPILib 2024](https://docs.wpilib.org/)
- [CTRE Phoenix 6 SDK](https://docs.ctr-electronics.com/)
- Controle Xbox via porta USB
- Roborio com CAN configurado e motor TalonFX (Kraken X60 ou similar)

---

## 🚀 Como Rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repo.git
