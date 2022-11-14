# 기능 구현 목록

## 로또 기능
- - -
- [ ] 로또 발행 : 1~45에서 중복되지 않는 6개의 숫자를 뽑는다. - Generator#createRandomLotto
  - [ ] 로또 발행 : 구입 금액(장당 1000원)에 해당하는 만큼 로또를 발행한다. - Generator#createLottoByPay
- [ ] 당첨된 로또들의 수익금을 합한다. - Calculator#sumJackpot
  - [ ] 수익률 통계는 소수점 둘째 자리에서 반올림한다. - Calculator#calculateEarningRate
- [ ] 만들어진 로또와 입력한 로또가 일치하는지 비교한다 - Judgement#rankLotto
  - [ ] 5개 일치의 경우, 보너스 번호가 일치하는지 비교한다 - Judgement#secondPrize
  - [ ] 발행한 로또들의 당첨 결과를 리스트에 저장한다 - Judgement#makeWinnigTable

## 입력
- - -
- [ ] 로또 구입 금액을 1000원 단위로 입력한다. - Input#payForLotto
- [ ] 당첨 번호 6개를 쉼표 기준으로 입력한다. - Input#winningNumber
- [ ] 보너스 번호를 입력한다. - Input#bonusNumber

## 출력
- - -
- [ ] 시작 시 ```구입금액을 입력해 주세요.``` 출력한다. - Input#payForLotto
- [ ] 구입 금액을 입력하면 그 갯수만큼 ```n개를 구매했습니다.```를 출력한다.
- [ ] 2번에 구매한 로또의 목록을 오름차순으로 출력한다.
- [ ] 당첨 번호를 입력할 떄 ```당첨 번호를 입력해 주세요.```를 출력한다. - Input#winningNumber
- [ ] 보너스 번호를 입력할 떄 ```보너스 번호를 입력해 주세요.```를 출력한다. - Input#bonusNumber
- [ ] 당첨 통계를 양식에 맞춰 출력한다. - Output#writeDown
- [ ] 수익률을 소수점 두자리까지 출력한다. - Calculator#calculateEarningRate

## 예외처리
- - -
- [ ] 모든 에러 문구는 ```[ERROR]```로 시작한다.
- [ ] 구입 금액 입력시, 1000원 단위가 아니면 예외 처리 한다.
- [ ] 당첨 번호 입력시, 6개의 숫자가 아니면 예외 처리 한다.
- [ ] 당첨 번호 입력시, 중복 숫자가 있으면 예외 처리 한다.
- [ ] 보너스 번호 입력시, 한개의 숫자가 아니면 예외 처리 한다.
- [ ] 보너스 번호 입력시, 로또 번호와 중복 숫자이면 예외 처리 한다.