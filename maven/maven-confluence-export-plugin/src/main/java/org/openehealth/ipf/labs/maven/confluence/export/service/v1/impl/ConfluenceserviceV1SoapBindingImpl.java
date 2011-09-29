/**
 * ConfluenceserviceV1SoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openehealth.ipf.labs.maven.confluence.export.service.v1.impl;

import org.openehealth.ipf.labs.maven.confluence.export.service.v1.ConfluenceSoapService;
import org.openehealth.ipf.labs.maven.confluence.export.stubs.v1.*;

public class ConfluenceserviceV1SoapBindingImpl implements ConfluenceSoapService {
    public RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public java.lang.String[] getGroups(java.lang.String in0) throws java.rmi.RemoteException, NotPermittedException, RemoteException {
        return null;
    }

    public boolean removeGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, AuthenticationFailedException, RemoteException {
        return null;
    }

    public RemoteAttachment[] getAttachments(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteAttachment addAttachment(java.lang.String in0, long in1, RemoteAttachment in2, byte[] in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteAttachment addAttachment(java.lang.String in0, RemoteAttachment in1, byte[] in2) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean removeAttachment(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteContentPermissionSet getContentPermissionSet(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteContentPermissionSet[] getContentPermissionSets(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteClusterInformation getClusterInformation(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean isPluginEnabled(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
        return false;
    }

    public RemoteComment addComment(java.lang.String in0, RemoteComment in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteComment[] getComments(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean removeComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public RemotePageSummary[] getDescendents(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemotePageSummary[] getAncestors(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteAttachment getAttachment(java.lang.String in0, long in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public void addUser(java.lang.String in0, RemoteUser in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
    }

    public RemoteLabel[] getRelatedLabels(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSpaceSummary[] getSpaces(java.lang.String in0) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSpaceGroup getSpaceGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, AlreadyExistsException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteSpaceGroup[] getSpaceGroups(java.lang.String in0) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean removeSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean convertToPersonalSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, boolean in4) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemotePageSummary[] getPages(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean setContentPermissions(java.lang.String in0, long in1, java.lang.String in2, RemoteContentPermission[] in3) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean moveAttachment(java.lang.String in0, long in1, java.lang.String in2, long in3, java.lang.String in4) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteComment editComment(java.lang.String in0, RemoteComment in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public RemotePageSummary[] getTopLevelPages(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public byte[] getAttachmentData(java.lang.String in0, long in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean deactivateUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean reactivateUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public RemoteSpace addSpace(java.lang.String in0, RemoteSpace in1) throws java.rmi.RemoteException, InvalidSessionException, AlreadyExistsException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteLabel[] getRecentlyUsedLabels(java.lang.String in0, int in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteLabel[] getRecentlyUsedLabelsInSpace(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteLabel[] getMostPopularLabels(java.lang.String in0, int in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteLabel[] getMostPopularLabelsInSpace(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean setEnableWysiwyg(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public java.lang.String[] getPermissionsForUser(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public boolean removeAllPermissionsForGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean removeSpaceGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteLabel[] getRelatedLabelsInSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSpace[] getSpacesContainingContentWithLabel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSpace[] getSpacesWithLabel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteLabel[] getLabelsByDetail(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean movePageToTopLevel(java.lang.String in0, long in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean movePage(java.lang.String in0, long in1, long in2, java.lang.String in3) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public java.lang.String exportSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public java.lang.String exportSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean hasUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return false;
    }

    public RemotePageHistory[] getPageHistory(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean removePage(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public java.lang.String renderContent(java.lang.String in0, java.lang.String in1, long in2, java.lang.String in3) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public java.lang.String renderContent(java.lang.String in0, java.lang.String in1, long in2, java.lang.String in3, java.util.HashMap in4) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemotePage storePage(java.lang.String in0, RemotePage in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, VersionMismatchException, RemoteException {
        return null;
    }

    public RemotePage updatePage(java.lang.String in0, RemotePage in1, RemotePageUpdateOptions in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, VersionMismatchException, RemoteException {
        return null;
    }

    public RemoteSpaceSummary[] getSpacesInGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteSpace storeSpace(java.lang.String in0, RemoteSpace in1) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteSpaceGroup addSpaceGroup(java.lang.String in0, RemoteSpaceGroup in1) throws java.rmi.RemoteException, InvalidSessionException, AlreadyExistsException, NotPermittedException, RemoteException {
        return null;
    }

    public RemoteSpace addPersonalSpace(java.lang.String in0, RemoteSpace in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, AlreadyExistsException, NotPermittedException, RemoteException {
        return null;
    }

    public java.lang.String[] getSpaceLevelPermissions(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean addPermissionToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean addGlobalPermissions(java.lang.String in0, java.lang.String[] in1, java.lang.String in2) throws java.rmi.RemoteException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addGlobalPermission(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addAnonymousUsePermission(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean removeGlobalPermission(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean addPermissionsToSpace(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean removePermissionFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean editUser(java.lang.String in0, RemoteUser in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public java.lang.String[] getUserGroups(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return null;
    }

    public boolean addUserToGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeUserFromGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public java.lang.String[] getActiveUsers(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean changeMyPassword(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return false;
    }

    public boolean changeUserPassword(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean setUserInformation(java.lang.String in0, RemoteUserInformation in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public RemoteUserInformation getUserInformation(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean hasGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return false;
    }

    public boolean addProfilePicture(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, byte[] in4) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public RemoteBlogEntry getBlogEntryByDayAndTitle(java.lang.String in0, java.lang.String in1, int in2, java.lang.String in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteBlogEntry getBlogEntry(java.lang.String in0, long in1) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteBlogEntrySummary[] getBlogEntries(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteBlogEntry storeBlogEntry(java.lang.String in0, RemoteBlogEntry in1) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, VersionMismatchException, RemoteException {
        return null;
    }

    public java.lang.String exportSite(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean flushIndexQueue(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean clearIndexQueue(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteNodeStatus[] getClusterNodeStatuses(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public boolean importSpace(java.lang.String in0, byte[] in1) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean setEnableAnonymousAccess(java.lang.String in0, boolean in1) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public RemoteLabel[] getLabelsById(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSearchResult[] getLabelContentById(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSearchResult[] getLabelContentByName(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSearchResult[] getLabelContentByObject(java.lang.String in0, RemoteLabel in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public boolean addLabelByName(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addLabelById(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addLabelByObject(java.lang.String in0, RemoteLabel in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean addLabelByNameToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeLabelByName(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeLabelById(java.lang.String in0, long in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeLabelByObject(java.lang.String in0, RemoteLabel in1, long in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeLabelByNameFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, NotPermittedException, RemoteException {
        return false;
    }

    public boolean removeAnonymousUsePermission(java.lang.String in0) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean addAnonymousPermissionToSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean addAnonymousPermissionsToSpace(java.lang.String in0, java.lang.String[] in1, java.lang.String in2) throws java.rmi.RemoteException, RemoteException {
        return false;
    }

    public boolean removeAnonymousPermissionFromSpace(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, NotPermittedException, RemoteException {
        return false;
    }

    public RemotePermission[] getPagePermissions(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public java.lang.String[] getPermissions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSearchResult[] search(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteSearchResult[] search(java.lang.String in0, java.lang.String in1, java.util.HashMap in2, int in3) throws java.rmi.RemoteException, RemoteException {
        return null;
    }

    public RemoteSpace getSpace(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemotePageSummary[] getChildren(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemotePage getPage(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

    public RemotePage getPage(java.lang.String in0, long in1) throws java.rmi.RemoteException, InvalidSessionException, RemoteException {
        return null;
    }

}
