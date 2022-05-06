package by.javaintroonline.modul04.simple_class_and_object.task06;

/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */

public class Time {

	private String point = ".";
	private String zero = "0";
	private String hours;
	private String minutes;
	private String seconds;
	private static int allSecondsInDay = 24 * 3600 - 1;

	public Time() {
		hours = "00";
		minutes = "00";
		seconds = "00";
	}

	public void setDefault() {
		hours = "00";
		minutes = "00";
		seconds = "00";
	}

	public void setHours(int hours) {

		if (hours >= 0 && hours <= 23) {
			this.hours = Integer.toString(hours);
		} else {
			this.hours = "00";
		}
	}

	public void setMinutes(int minutes) {

		if (minutes >= 0 && minutes <= 59) {
			this.minutes = Integer.toString(minutes);
		} else {
			this.minutes = "00";
		}
	}

	public void setSeconds(int seconds) {

		if (seconds >= 0 && seconds <= 59) {
			this.seconds = Integer.toString(seconds);
		} else {
			this.seconds = "00";
		}
	}

	public void printTime() {
		System.out.println(hours + point + minutes + point + seconds);
	}

	private void setTime(int seconds) {

		int allSeconds = Integer.parseInt(this.hours) * 3600 + Integer.parseInt(this.minutes) * 60
				+ Integer.parseInt(this.seconds);

		if (allSeconds + seconds <= 0 && allSeconds + seconds >= allSecondsInDay) {
			setDefault();
		} else {

			seconds = allSeconds + seconds;
			if (seconds >= 3600) {

				int howManyHours = seconds / 3600;
				seconds -= howManyHours * 3600;
				howManyHours = howManyHours % 24;

				if (howManyHours >= 10) {
					this.hours = Integer.toString(howManyHours);
				} else {
					this.hours = zero + Integer.toString(howManyHours);
				}

				if (seconds == 0) {

					this.minutes = "00";
					this.seconds = "00";
					return;

				} else if (seconds >= 60) {

					int howManyMinutes = seconds / 60;
					seconds -= howManyMinutes * 60;

					if (howManyMinutes >= 10) {
						this.minutes = Integer.toString(howManyMinutes);
					} else {
						this.minutes = zero + Integer.toString(howManyMinutes);
					}

					if (seconds >= 10) {
						this.seconds = Integer.toString(seconds);
					} else {
						this.seconds = zero + Integer.toString(seconds);
					}

				}

			}
		}
	}

	public void plusHours(int hours) {
		setTime(hours * 3600);

	}

	public void plusMinutes(int minutes) {
		setTime(minutes * 60);
	}

	public void plusSeconds(int seconds) {
		setTime(seconds);
	}
}
