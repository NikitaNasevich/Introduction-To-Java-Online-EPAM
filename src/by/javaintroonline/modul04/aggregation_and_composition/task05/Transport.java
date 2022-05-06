package by.javaintroonline.modul04.aggregation_and_composition.task05;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Transport {
	private TransportType transport;

	public Transport(TransportType transport) {
		this.transport = transport;
	}

	public void setTransport(TransportType transport) {
		this.transport = transport;
	}

	public TransportType gerTransport() {
		return transport;
	}

	public String toString() {
		return transport.toString();
	}
}
