/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.tables.Event;
import jooq.postgresql.gen.public_.tables.records.EventRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventDao extends DAOImpl<EventRecord, jooq.postgresql.gen.public_.tables.pojos.Event, Integer> {

    /**
     * Create a new EventDao without any configuration
     */
    public EventDao() {
        super(Event.EVENT, jooq.postgresql.gen.public_.tables.pojos.Event.class);
    }

    /**
     * Create a new EventDao with an attached configuration
     */
    public EventDao(Configuration configuration) {
        super(Event.EVENT, jooq.postgresql.gen.public_.tables.pojos.Event.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.postgresql.gen.public_.tables.pojos.Event object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Event> fetchById(Integer... values) {
        return fetch(Event.EVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.postgresql.gen.public_.tables.pojos.Event fetchOneById(Integer value) {
        return fetchOne(Event.EVENT.ID, value);
    }

    /**
     * Fetch records that have <code>eventtype IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Event> fetchByEventtype(String... values) {
        return fetch(Event.EVENT.EVENTTYPE, values);
    }

    /**
     * Fetch records that have <code>eventid IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Event> fetchByEventid(Integer... values) {
        return fetch(Event.EVENT.EVENTID, values);
    }

    /**
     * Fetch records that have <code>experimentrun IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Event> fetchByExperimentrun(Integer... values) {
        return fetch(Event.EVENT.EXPERIMENTRUN, values);
    }
}