package org.maas.objects;

public class DoughPrepTable extends Equipment {

    public DoughPrepTable(String guid) {
        super(guid);
    }

    @Override
    public String toString() {
        return "DoughPrepTable [guid=" + getGuid() + "]";
    }

}