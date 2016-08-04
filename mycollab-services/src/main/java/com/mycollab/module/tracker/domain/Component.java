/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_tracker_component*/
package com.mycollab.module.tracker.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_tracker_component")
public class Component extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.id
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.componentname
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Length(max=1000, message="Field value is too long")
    @Column("componentname")
    private String componentname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.userlead
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("userlead")
    private String userlead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.createdUser
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("createdUser")
    private String createduser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.sAccountId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.lastUpdatedTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.createdTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.status
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.prjKey
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Column("prjKey")
    private Integer prjkey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_component.description
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    @Length(max=65535, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Component item = (Component)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1809, 1841).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.id
     *
     * @return the value of m_tracker_component.id
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.id
     *
     * @param id the value for m_tracker_component.id
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.projectId
     *
     * @return the value of m_tracker_component.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.projectId
     *
     * @param projectid the value for m_tracker_component.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.componentname
     *
     * @return the value of m_tracker_component.componentname
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public String getComponentname() {
        return componentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.componentname
     *
     * @param componentname the value for m_tracker_component.componentname
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setComponentname(String componentname) {
        this.componentname = componentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.userlead
     *
     * @return the value of m_tracker_component.userlead
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public String getUserlead() {
        return userlead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.userlead
     *
     * @param userlead the value for m_tracker_component.userlead
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setUserlead(String userlead) {
        this.userlead = userlead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.createdUser
     *
     * @return the value of m_tracker_component.createdUser
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.createdUser
     *
     * @param createduser the value for m_tracker_component.createdUser
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.sAccountId
     *
     * @return the value of m_tracker_component.sAccountId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.sAccountId
     *
     * @param saccountid the value for m_tracker_component.sAccountId
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.lastUpdatedTime
     *
     * @return the value of m_tracker_component.lastUpdatedTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_tracker_component.lastUpdatedTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.createdTime
     *
     * @return the value of m_tracker_component.createdTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.createdTime
     *
     * @param createdtime the value for m_tracker_component.createdTime
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.status
     *
     * @return the value of m_tracker_component.status
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.status
     *
     * @param status the value for m_tracker_component.status
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.prjKey
     *
     * @return the value of m_tracker_component.prjKey
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public Integer getPrjkey() {
        return prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.prjKey
     *
     * @param prjkey the value for m_tracker_component.prjKey
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setPrjkey(Integer prjkey) {
        this.prjkey = prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_component.description
     *
     * @return the value of m_tracker_component.description
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_component.description
     *
     * @param description the value for m_tracker_component.description
     *
     * @mbggenerated Thu Aug 04 14:09:39 ICT 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        projectid,
        componentname,
        userlead,
        createduser,
        saccountid,
        lastupdatedtime,
        createdtime,
        status,
        prjkey,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}