package com.mossle.feedback.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FeedbackInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "FEEDBACK_INFO")
public class FeedbackInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private FeedbackCatalog feedbackCatalog;

    /** null. */
    private String content;

    /** null. */
    private String contact;

    /** null. */
    private String status;

    /** null. */
    private Date createTime;

    /** null. */
    private String userId;

    public FeedbackInfo() {
    }

    public FeedbackInfo(Long id) {
        this.id = id;
    }

    public FeedbackInfo(Long id, FeedbackCatalog feedbackCatalog,
            String content, String contact, String status, Date createTime,
            String userId) {
        this.id = id;
        this.feedbackCatalog = feedbackCatalog;
        this.content = content;
        this.contact = contact;
        this.status = status;
        this.createTime = createTime;
        this.userId = userId;
    }

    /** @return null. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATALOG_ID")
    public FeedbackCatalog getFeedbackCatalog() {
        return this.feedbackCatalog;
    }

    /**
     * @param feedbackCatalog
     *            null.
     */
    public void setFeedbackCatalog(FeedbackCatalog feedbackCatalog) {
        this.feedbackCatalog = feedbackCatalog;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 200)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Column(name = "CONTACT", length = 200)
    public String getContact() {
        return this.contact;
    }

    /**
     * @param contact
     *            null.
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
}