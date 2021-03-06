package dd2.local.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: KDJ
 * Date: 13. 11. 11
 * Time: 오전 10:03
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.IdClass(dd2.local.entity.AdUserRoleEntityPK.class)
@javax.persistence.Table(name = "AD_User_Role")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class AdUserRoleEntity {
    private Long adUserId;
    private Long adRoleId;
    private Long adCompanyId;
    private Date created;
    private Long createdBy;
    private Date updated;
    private Long updatedBy;

    @javax.persistence.Column(name = "AD_User_ID")
    @Id
    public Long getAdUserId() {
        return adUserId;
    }

    public void setAdUserId(Long adUserId) {
        this.adUserId = adUserId;
    }

    @javax.persistence.Column(name = "AD_Role_ID")
    @Id
    public Long getAdRoleId() {
        return adRoleId;
    }

    public void setAdRoleId(Long adRoleId) {
        this.adRoleId = adRoleId;
    }

    @javax.persistence.Column(name = "AD_Company_ID")
    @Id
    public Long getAdCompanyId() {
        return adCompanyId;
    }

    public void setAdCompanyId(Long adCompanyId) {
        this.adCompanyId = adCompanyId;
    }

    @javax.persistence.Column(name = "Created")
    @Basic
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @javax.persistence.Column(name = "CreatedBy")
    @Basic
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @javax.persistence.Column(name = "Updated")
    @Basic
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @javax.persistence.Column(name = "UpdatedBy")
    @Basic
    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdUserRoleEntity that = (AdUserRoleEntity) o;

        if (adCompanyId != null ? !adCompanyId.equals(that.adCompanyId) : that.adCompanyId != null) return false;
        if (adRoleId != null ? !adRoleId.equals(that.adRoleId) : that.adRoleId != null) return false;
        if (adUserId != null ? !adUserId.equals(that.adUserId) : that.adUserId != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adUserId != null ? adUserId.hashCode() : 0;
        result = 31 * result + (adRoleId != null ? adRoleId.hashCode() : 0);
        result = 31 * result + (adCompanyId != null ? adCompanyId.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        return result;
    }
}
