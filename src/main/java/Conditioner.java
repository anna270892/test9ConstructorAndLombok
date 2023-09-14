public class Conditioner {
    private int maxTemperature = 30; //максимальная температура
    private int minTemperature = 10; //минимальная температура
    private int currentTemperature = minTemperature; //поле с минимальной текущей температурой, присвоили чтоб ноль не инициализировался
    public int getCurrentTemperature() {  //возвращает текущую температуру
        return currentTemperature;
    }

    public int getMaxTemperature() { //возвращает максимальную температуру
        return maxTemperature;
    }

    public int getMinTemperature() { //возвращает минимальную температуру
        return minTemperature;
    }

    //конструктор, который возьмет данные в указанных параемтрах minTemperature и maxTemperature
    public Conditioner(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature; //поле = параметр
        this.maxTemperature = maxTemperature; //поле = параметр
        this.currentTemperature = minTemperature; //поле = параметр

    }

    public Conditioner (int size) {
        maxTemperature = minTemperature + size;
    }


    public void setCurrentTemperature(int newCurrentTemperature) {
        if (newCurrentTemperature < minTemperature) { //если температура меньше нуля то мы не можем ее поставить
            return;
        }
        if (newCurrentTemperature > maxTemperature) { //новая температура больше максиамальной уходим из метода
            return;
        }
        currentTemperature = newCurrentTemperature;
    }


    public void increaseTemp50p() {
        int target = currentTemperature * 3 / 2; //currentTemperature - текущая температура
        setCurrentTemperature(target); //вызываем готовый сетер, для проверки превышения максимально допустимого значения
    }

    public void setToMaxTemperature() {    //функция не будет ни чег возвращать, кондиционер просто меняет внутри температуру и не сообщает нам ни чего
//кондиционер знает какая у него текущая температруа и какая максимальная
        currentTemperature = maxTemperature;
    }
}