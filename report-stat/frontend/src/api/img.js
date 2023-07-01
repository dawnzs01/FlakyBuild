import {getUUID} from "metersphere-frontend/src/utils";
import {fileUpload, get} from "metersphere-frontend/src/plugins/request"


export function uploadMarkDownImg(file) {
  let param = {
    id: getUUID().substring(0, 8)
  };
  file.prefix = param.id;
  param.fileName = file.name.substring(file.name.lastIndexOf('.'));

  return fileUpload('/resource/md/upload', file, param);
}

export function deleteMarkDownImg(file, callback) {
  if (file) {
    return get('/resource/md/delete/' + file[1].name, callback);
  }
  return {};
}
