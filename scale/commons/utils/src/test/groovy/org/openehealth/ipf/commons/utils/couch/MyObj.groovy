package org.openehealth.ipf.commons.utils.couch

class MyObj {
    def String _id = null
    def String _rev = null
    def String key = 'value1'
    def Map<String, Object> _attachments

    boolean equals(o) {
        if (this.is(o)) return true;

        if (!o || getClass() != o.class) return false;

        MyObj myObj = (MyObj) o;

        if (_attachments ? !_attachments.equals(myObj._attachments) : myObj._attachments != null) return false;
        if (_id ? !_id.equals(myObj._id) : myObj._id != null) return false;
        if (_rev ? !_rev.equals(myObj._rev) : myObj._rev != null) return false;
        if (key ? !key.equals(myObj.key) : myObj.key != null) return false;

        return true;
    }

    int hashCode() {
        int result;

        result = (_id ? _id.hashCode() : 0);
        result = 31 * result + (_rev ? _rev.hashCode() : 0);
        result = 31 * result + (key ? key.hashCode() : 0);
        result = 31 * result + (_attachments ? _attachments.hashCode() : 0);
        return result;
    }
}
