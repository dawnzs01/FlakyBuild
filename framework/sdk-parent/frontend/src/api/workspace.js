import {get} from "../plugins/request";

export function getIntegrationService() {
  return get("/service/integration/all")
}

export function getUserWorkspaceList() {
  return get('/workspace/list/userworkspace');
}

export function switchWorkspace(workspaceId) {
  return get(`/user/switch/source/ws/${workspaceId}`);
}
