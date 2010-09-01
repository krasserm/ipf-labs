package org.openehealth.ipf.commons.store

class QueryIterator {
    def value

    @Override
    boolean equals(o) {
        if (this.is(o)) return true;
        if (!o || getClass() != o.class) return false;
        value.equals(((QueryIterator) o).value)
    }

    @Override
    int hashCode() {
        return (value ? value.hashCode() : 0);
    }

    @Override
    String toString() {
        value.toString()
    }
}
